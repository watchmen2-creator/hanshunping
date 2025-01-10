package chapter10.com.hspedu.abstract_;

public class AA extends Template {

    //抽象出去，继承父类的方法
//    //统计任务的时间
//    public void time() {
//        //获取任务开始时间
//        long startTime = System.currentTimeMillis();
//        //执行任务
//        job();
//        //任务结束
//        //获取任务结束时间
//        long endTime = System.currentTimeMillis();
//        //计算任务执行时间
//        long time = endTime - startTime;
//        //输出结果
//        System.out.println("任务执行时间：" + time + "ms");
//    }

    //重写计算任务来实现方法
    @Override
    public void job() {

        //定义总数
        int sum = 0;
        //循环10000次求和
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
        //睡眠一会，用于区分任务执行时间
        try {
            // 让当前线程睡眠 2000 毫秒（即 2 秒）
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // 如果线程在睡眠时被中断，会抛出 InterruptedException
            System.out.println("线程睡眠被中断！");
        }
    }

}
