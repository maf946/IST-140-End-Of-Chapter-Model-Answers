public class Main
{
    public static void main(String[] args)
    {
        int[] values = new int[20];
        for (int i = 0; i < values.length; i++)
        {
            values[i] = (int) ((Math.random() * 6) + 1);
        }
        boolean inRun = false;
        int openParCount = 0;
        int closeParCount = 0;
        for(int i = 0; i < values.length; i++){

            if(i == 0) {
                if ((values[i] == values[i + 1])) {
                    System.out.print("(");
                    System.out.print(values[i] + " ");
                    inRun = true;
                    openParCount++;
                } else{
                    System.out.print(values[i] + " ");
                }

            }else if (i == 19){
                if ((values[i] == values[i - 1])) {
                    System.out.print(values[i] + ") ");
                    inRun = false;
                    closeParCount++;
                } else {
                    System.out.print(values[i] + " ");
                }
            }
            else {
                if ((values[i] == values[i + 1]) && !inRun) {
                    System.out.print("(");
                    System.out.print(values[i] + " ");
                    inRun = true;
                    openParCount++;
                } else if ((values[i] == values[i - 1]) && (values[i] != values[i + 1])) {
                    System.out.print(values[i] + ") ");
                    inRun = false;
                    closeParCount++;
                } else {
                    System.out.print(values[i] + " ");
                }
            }
        }
        if(openParCount != closeParCount){
            System.out.print(")");
        }
    }
}
