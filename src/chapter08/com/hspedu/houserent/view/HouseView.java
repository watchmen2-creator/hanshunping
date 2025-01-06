package chapter08.com.hspedu.houserent.view;

import chapter08.com.hspedu.houserent.domain.House;
import chapter08.com.hspedu.houserent.service.HouseService;
import chapter08.com.hspedu.houserent.utils.Utility;

/*
 * 相当于前端
 * 1.显示界面
 * 2.接受用户的输入
 * 3.调用HouseService类完成对房屋信息的各种操作
 *
 * */
public class HouseView {
    private boolean loop = true;//控制是否显示菜单
    private char key = ' ';//接受用户的选择
    private HouseService houseService = new HouseService(10);//创建后端对象，以便调用后端方法
    // 暂定房屋有10个，创建一个10个大小的房屋数组，感觉在前端这定义数据大小有点怪怪的

    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("=============房屋出租系统菜单=============");
            System.out.println("\t\t\t 1 新 增 房 源");
            System.out.println("\t\t\t 2 查 找 房 屋");
            System.out.println("\t\t\t 3 删 除 房 屋 信 息");
            System.out.println("\t\t\t 4 修 改 房 屋 信 息");
            System.out.println("\t\t\t 5 房 屋 列 表");
            System.out.println("\t\t\t 6 退 出");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println("请输入你的选择（1~6）：");
            key = Utility.readChar();//工具类
            switch (key) {
                case '1': {
//                    System.out.println("新增");
                    addHouse();
                    break;
                }
                case '2': {
//                    System.out.println("查找");
                    selectHouse();
                    break;
                }
                case '3': {
//                    System.out.println("删除");
                    deleteHouse();
                    break;
                }
                case '4': {
//                    System.out.println("修改");
                    updateHouse();
                    break;

                }
                case '5': {
//                    System.out.println("列表");
                    listHouse();
                    break;

                }
                case '6': {
//                    loop = false;
                    exit();
                    break;
                }
            }
        } while (loop);
    }

    //显示房屋列表
    public void listHouse() {
        System.out.println("-------------房  屋  列  表-------------");
        System.out.println();
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i].printInfo());
            }
        }
        System.out.println();
        System.out.println("-------------房 屋 列 表 完 成-------------");
        System.out.println();
    }

    //编写addHouse方法，接受输入，创建House对象，调用add方法
    public void addHouse() {

        //之后可以在这再优化，选择新增时就先判断一下能不能添加，能添加在走下边的代码，不能添加就直接提示
        //现在是选择了添加先把房屋信息都输入完了，才告诉添加失败

        System.out.println("-------------添  加  房  屋-------------");
        System.out.println();//占位，调整样式

        System.out.print("房主姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String tel = Utility.readString(12);
        System.out.print("房屋地址：");
        String address = Utility.readString(16);
        System.out.print("房屋月租：");
        double rent = Utility.readDouble();
        System.out.print("房屋状态（未出租/已出租）：");
        String state = Utility.readString(3);

        //根据接受到的信息创建房屋对象，ID是系统分配的，不用用户输入
        House house = new House(0, name, tel, address, rent, state);

        System.out.println();//占位，调整样式
        //调用后端方法添加房屋，并根据后端方法返回结果进行提示
        if (houseService.add(house)) {
            System.out.println("操作成功，添加了一个房屋");
        } else {
            System.out.println("操作失败，没有添加成功");
        }
        System.out.println();//占位，调整样式
    }

    //前端的关于删除房屋的方法
    public void deleteHouse() {
        System.out.println("-------------删  除  房  屋-------------");
        System.out.println();//占位，调整样式

        System.out.print("请选择要删除的房屋编号（-1退出）：");
        int houseId = Utility.readInt();
        if (houseId == -1) {
            System.out.println("退出删除");
            return;
        }

        System.out.println();//占位，调整样式

        /**
         * 直接调用工具类里面的方法（含提示啥的）
         * Utility.readConfirmSelection()
         * 功能：读取键盘输入的确认选项，Y或N
         * 将小的功能，封装到一个方法中.
         * @return Y或N
         */
        if ('Y' == Utility.readConfirmSelection()) {//如果确认了要删除，就调用后端方法把房屋删除
            //后端方法，根据后端方法的返回值给予相应的信息提示
            if (houseService.delete(houseId)) {
                System.out.println("操作成功，您已经删除编号为：" + houseId + " 的房屋。");
            } else {
                System.out.println("删除失败，请输入 5 检查列表中是否有您要删除的房屋编号");
            }

        } else {
            System.out.println("退出删除房屋操作");
        }

        System.out.println();//占位，调整样式
    }

    //前端关于退出确认的方法
    public void exit() {
        /**
         * 直接调用工具类里面的方法（含提示啥的）
         * Utility.readConfirmSelection()
         * 功能：读取键盘输入的确认选项，Y或N
         * 将小的功能，封装到一个方法中.
         * @return Y或N
         */
        if ('Y' == Utility.readConfirmSelection()) {//如果确认了要退出，就退出
            loop = false;
        } else {
            System.out.println("取消退出，返回房租出租系统菜单");
        }
    }


    //前端的关于查找房屋的方法
    public void selectHouse() {
        System.out.println("-------------查  找  房  屋-------------");
        System.out.println();//占位，调整样式

        System.out.print("请选择要查找的房屋编号（-1退出）：");
        int houseId = Utility.readInt();
        if (houseId == -1) {
            System.out.println("退出查找");
            return;
        }

        System.out.println();//占位，调整样式


        //后端方法，根据后端方法的返回值给予相应的信息提示
        House house = houseService.select(houseId);

        if (house != null) {
            System.out.println("查找成功");
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
            System.out.println(house.printInfo());
        } else {
            System.out.println("查找失败，请输入 5 检查列表中是否有您要删除的房屋编号");
        }

        System.out.println();//占位，调整样式
    }

    //前端的关于修改房屋的方法
    //先调用查找房屋的方法，把信息返回，然后根据用户的输入把信息更新就可以了
    public void updateHouse() {
        System.out.println("-------------修  改  房  屋-------------");
        System.out.println();//占位，调整样式

        System.out.print("请选择要修改的房屋编号（-1退出）：");
        int houseId = Utility.readInt();
        if (houseId == -1) {
            System.out.println("退出修改");
            return;
        }

        System.out.println();//占位，调整样式


        //后端方法，根据后端方法的返回值给予相应的信息提示
        House house = houseService.select(houseId);

        if (house == null) {
            System.out.println("查找失败，请输入 5 检查列表中是否有您要修改的房屋编号");
            return;
        }

        System.out.print("房主姓名（" + house.getName() + "）：");
        String name = Utility.readString(8, house.getName());
        System.out.print("电话（" + house.getPhone() + "）：");
        String tel = Utility.readString(12, house.getPhone());
        System.out.print("房屋地址（" + house.getAddress() + "）：");
        String address = Utility.readString(16, house.getAddress());
        System.out.print("房屋月租（" + house.getRent() + "）：");
        double rent = Utility.readDouble(house.getRent());
        System.out.print("房屋状态（" + house.getState() + "）（未出租/已出租）：");
        String state = Utility.readString(3, house.getState());

        //根据接受到的信息创建房屋对象，ID是系统分配的，不用用户输入
        House toHouse = new House(house.getId(), name, tel, address, rent, state);

        System.out.println();//占位，调整样式
        //调用后端方法添加房屋，并根据后端方法返回结果进行提示
        if (houseService.update(toHouse)) {
            System.out.println("操作成功，修改了编号为：" + houseId + "的房屋信息");
        } else {
            System.out.println("操作失败，没有修改成功");
        }


        System.out.println();//占位，调整样式
    }
}
