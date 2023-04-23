public class ABpractecingTwoDArray {
    public static void main(String[] args) {
        int A[][]=new int[5][5];

        int B[][]={{1,2,3},{3,5,7},{2,4,6}};
/* 


INITIALIZATION OF 2D ARRAY
        int C[][];
        C=new int[][];

        int []D[]=new int[][];

        int []E,F[];   //E IS ONE DIMENSIONAL AND F IS TWO DIMENSIONAL
        E=int[];
        F=int[][];
        */ 

        //ACCESSING OF ELEMENT OF ARRAY
        for(int i = 0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(B[i][j]+",");
            }
            System.out.println("");
        }
        //BY USING FOR EACH LOOP
        System.out.println("BY USING FOR EACH LOOP");
        for(int x[]:B){
            for(int y:x){
                System.out.print(y+",");
            }
            System.out.println("");
        }

    }
}
