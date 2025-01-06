package chapter08.com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *化繁为简
 * 1、先完成显示菜单，并可以选择菜单，给出对应提示
 * 2、完成零钱通明细
 * 3、完成收益入账
 * 4、完成消费
 * 5、改进：退出增加退出确认
 * 6、改进：对收益入账和消费支出的额度增加合理性校验
 * 7、重构：将面向过程的代码修改成面向对象的方法，SmallChangeSysOOP.java
 * */
public class SmallChangeSys {
    public static void main(String[] args) {

        //1、先完成显示菜单，并可以选择菜单，给出对应提示
        //菜单至少显示一次，用do-while循环
        boolean loop = true;//定义控制显示菜单循环的变量
        Scanner scanner = new Scanner(System.in);//定义获取输入内容的对象
        String key = "";//定义key获取输入的内容

        //2、完成零钱通明细
        // （1）可以把收益入账和消费保存到数组（2）可以使用对象（3）简单的话可以使用String拼接
        //先用（3）
        String details = "--------------------零钱通明细--------------------";//之后的每条明细都拼接在后边就行

        //3、完成收益入账
        //根据业务需要确定所需要的变量：入账金额、时间、余额...
        double money = 0;//定义获取没笔入账的金额，从scanner那拿到
        double banlance = 0;//定义总的余额
        Date date = new Date();//使用java.util.Date 类 的对象，获取系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//使用java.text.SimpleDateFormat 类 的对象，格式化date的系统时间格式

        //4、完成消费
        //根据业务需要确定所需要的变量：消费说明、消费金额、消费时间、余额...
        //消费说明需要一个新的变量记录，消费金额可以复用money、消费时间、余额都是可以复用
        String note = "";//定义变量记录消费说明

        //5、改进：退出增加退出确认
        String choice = "";
        boolean exitLoop = true;

        //6、改进：对收益入账和消费支出的额度增加合理性校验


        do {
            System.out.println("\n=============零钱通菜单=============");
            System.out.println("\t\t\t1 明   细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费支出");
            System.out.println("\t\t\t4 退   出");

            System.out.println("请选择（1~4）：");
            key = scanner.next();

            //使用Switch分支根据输入的内容展示相应的提示信息
            switch (key) {
                case "1": {
                    System.out.println(details);
                    break;
                }
                case "2": {
                    System.out.println("请输入收益入账金额：");
                    money = scanner.nextDouble();//先不做校验，之后再加
                    //找出不正确的金额条件，然后给出提示，只直接break
                    if (money <= 0) {
                        System.out.println("收益入账金额不正确");
                        break;
                    }
                    //之后这里可以写其他不正常的情况
                    //...
                    date = new Date();//获取系统时间作为收益入账的时间
                    banlance += money; //更新总余额
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + banlance;//更新零钱通明细总字符串

                    break;
                }
                case "3": {
                    System.out.println("请输入消费说明：");
                    note = scanner.next();//note从scanner那获取消费说明
                    System.out.println("请输入消费额度：");
                    money = scanner.nextDouble();//money从scanner那获取消费额度
                    if (money <= 0 || money > banlance) {//筛掉输入的消费额度不正确的情况
                        System.out.println("消费额度不正确");
                        break;
                    }
                    date = new Date();//获取系统时间作为消费的时间
                    banlance -= money;//更新总余额
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + banlance;//更新零钱通明细总字符串

                    break;
                }

                case "4": {
                    //选择退出时，增加确认提示：你确定要退出吗？y/n
                    //进入退出确认的循环
                    //必须输入正确的y/n，否则循环输入指令
                    /*
                    exitLoop = true;//每次选4都要进入退出确认的循环
                    while (exitLoop) {
                        System.out.println("你确定要退出吗？y/n");
                        verify = scanner.next();
                        switch (verify) {
                            case "y": {
                                exitLoop=false;
                                loop = false;
                                break;
                            }
                            case "n": {
                                exitLoop = false;
                                System.out.println("取消退出，已经返回零钱通首页");
                                break;
                            }
                            default: {
                                System.out.print("输入错误，请重新确认：\t");
                            }
                        }
                    }
                    break;
                    */
                    //按照老韩的思路再解耦合一下
                    //循环只确认是不是输入的y/n
                    //一段代码只完成一件小事
                    while (true) {
                        System.out.println("你确定要退出吗？y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    //能出来循环说明肯定选了y/n
                    if ("y".equals(choice)) {
                        loop = false;
                    }
                    break;

                }
                default: {
                    System.out.println("选择有误，请重新选择");
                }
            }

        } while (loop);
        System.out.println("---退出了零钱通系统---");
    }
}
