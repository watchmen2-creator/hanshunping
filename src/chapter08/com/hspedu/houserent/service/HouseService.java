package chapter08.com.hspedu.houserent.service;

import chapter08.com.hspedu.houserent.domain.House;

/*
 * 1. 定义House[]数组，专门用于保存House对象   //替代数据库的功能
 * 2. 响应HouseView的调用
 * 3. 完成对房屋信息的各种操作（CRUD）
 * */
public class HouseService {
    private House[] houses;//定义House数据，存放House对象
    private int houseNums = 0;//记录数组中实际的房屋数量
    private int idCount = 0;

    public HouseService(int size) {//在构造器里面，给定House数据的大小
        houses = new House[size];//在构造器里面，给定House数据的大小

        //为了方便开发测试，自己先在这里面把House数组 完善一下对象，之后实际业务是取传来的数据
        houses[0] = new House(1, "jack", "1334555455", "海淀", 2000.12, "未出租");
        setHouseNums(getHouseNums() + 1);//每次在数组里面创建对象就记得修改这个实际的房屋数量
        houses[0].setId(++idCount);

    }

    public int getHouseNums() {
        return houseNums;
    }

    public void setHouseNums(int houseNums) {
        this.houseNums = houseNums;
    }

    public House[] list() {
        return houses;
    }

    public boolean add(House house) {
        //先判断数组是否可以继续添加，暂时不考虑数组扩容的问题
        //需要有一个变量记录数组中有多少个房屋信息
        if (getHouseNums() >= houses.length) {
            System.out.println("房屋的数组满了，不能再添加房屋了");
            return false;
        }
        System.out.println("添加成功，这是第 " + (getHouseNums() + 1) + " 个房屋。");
//        houses[houseNums++] = house; //大佬可能会这样写，这一句顶我下边两句，要学习
        houses[getHouseNums()] = house;//往数组中实际房屋的下个位置添加新房屋
        houses[getHouseNums()].setId(++idCount);//更新这个房屋的ID
        setHouseNums(getHouseNums() + 1);//更新数组中实际房屋数量
        return true;//
    }

    /*
     * 删除方法
     * 入参：要删除的房屋的编号
     * 返回值：删除成功返回true，失败false
     * */
    public boolean delete(int houseID) {
        //先判断编号是否在数组里，然后如果在数据里，直接下标记录一下，删除的时候就不用再找一遍了
        int index = -1;
        for (int i = 0; i < getHouseNums(); i++) {
            if (houseID == houses[i].getId()) {
                index = i;
                break;
            }
        }
        if (index == -1) {//如果在数组里就删除，不在就提示错误，返回false
            System.out.println("删除失败，编号不存在");
            return false;
        }
        //进行删除操作
        for (int i = index; i < getHouseNums() - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
//        houses[getHouseNums() - 1] = null;
//        setHouseNums(getHouseNums() - 1);
        return true;
    }

    /*
     * 查找方法
     * 入参：要查找的房屋的编号
     * 返回值：找到了：返回信息，失败null
     * */
    public House select(int houseID) {
        int index = -1;
        for (int i = 0; i < getHouseNums(); i++) {
            if (houseID == houses[i].getId()) {
                index = i;
            }
        }

        if (index == -1) {
            return null;
        }
        return houses[index];
    }

    /*
     * 修改方法
     * 入参：要修改的房屋的编号
     * 返回值：找到了：返回信息，失败null
     * */
    public boolean update(House house) {
        int index = -1;
        for (int i = 0; i < getHouseNums(); i++) {
            if (house.getId() == houses[i].getId()) {
                index = i;
            }
        }

        if (index == -1) {
            return false;
        } else {
            houses[index] = house;
            return true;
        }
    }

}
