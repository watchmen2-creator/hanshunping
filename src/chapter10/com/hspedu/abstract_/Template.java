package chapter10.com.hspedu.abstract_;

abstract public class Template {
    //统计任务的时间
    public void time() {
        //获取任务开始时间
        long startTime = System.currentTimeMillis();
        //执行任务
        job();
        //任务结束
        //获取任务结束时间
        long endTime = System.currentTimeMillis();
        //计算任务执行时间
        long time = endTime - startTime;
        //输出结果
        System.out.println("任务执行时间：" + time + "ms");
    }
    //抽象工作方法
    public abstract void job();
}
