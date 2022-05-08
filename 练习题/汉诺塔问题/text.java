public class text {
public static void move(char pos1,char pos2){
    System.out.print(pos1+"->"+pos2+" ");
}

    /**
     * 汉诺塔函数
     * @param n   盘子数量
     * @param pos1  起始柱子
     * @param pos2  中间过渡柱子
     * @param pos3   目的柱子
     */
    public static void hanoi(int n,char pos1,char pos2,char pos3){
    if(n==1){
        move(pos1,pos3);
    }else {
        //当盘子数大于1时，需要借助pos2
        //先将pos1上的n-1个盘子移动到pos2   然后将pos1上剩下的最后一个移动到po3
        hanoi(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        //然后再将pos2上的盘子借助pos1全部移动到pos3上
        hanoi(n-1,pos2,pos1,pos3);
     }
    }

    public static void main(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
        System.out.println();
    }
}