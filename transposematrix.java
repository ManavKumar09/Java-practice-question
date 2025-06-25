public class transposematrix {
    public static void changeMatrix(int [][] array) {
        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]  + " ");
            }
            System.out.println();
        }
       
    }
    

    public static void main(String[] args){
        int row =2; int column = 3;
        int [][] array = {{1,2,3}, {4,5,6}};

        int [][] transpose = new int [column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i] = array[i][j];
            }
        }
        changeMatrix(transpose);
        
    }
}
