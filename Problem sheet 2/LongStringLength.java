class LongStringLength{
    public static void main(String[] args){
        String[][] a = 	{{"help", "ok", "city lights"},
                         {"elvisLives", "hello", "punch-out"},
                         {"hurrah", "humptydumpty", "123"}};
                         
        for(int i=0; i<=2; i++)
        {
            int max = 0;
            for(int j=0; j<=2; j++)
            {
                if(a[j][i].length() > max)
                {
                    max = a[j][i].length();
                }
                //System.out.print(a[j][i].length() +"\t");
            }
            //int[] arr;
            System.out.print(max +"\t");
        }
    }
}
