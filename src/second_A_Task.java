public class second_A_Task
{


    private static int count = 0;
    private static int numb = 1;
    private static String output;

    private static void outputNumbSwitch(int index, int num)
    {
        switch (index)
        {
            case 0: numb += num; output += "+"+num + ")"; break;
            case 1: numb *= num; output += "*"+num + ")"; break;
            case 2: numb -= num; output += "-"+num + ")"; break;
            case 3: numb /= num; output += "/"+num + ")"; break;
        }
    }


    public static void main(String[] args)
    {
        for (int i = 0; i < 4;i++)
        {
            String out1 = "(((((1";
            int num1 = 1;
            output = out1;
            numb = num1;
            outputNumbSwitch(i,2);
            String out2 = output;
            int num2 = numb;
            for (int o = 0; o < 4;o++)
            {
                output = out2;
                numb = num2;
                outputNumbSwitch(o,3);
                String out3 = output;
                int num3 = numb;
                for (int p = 0; p < 4;p++)
                {
                    output = out3;
                    numb = num3;
                    outputNumbSwitch(p,4);
                    String out4 = output;
                    int num4 = numb;
                    for (int j = 0; j < 4;j++)
                    {
                        output = out4;
                        numb = num4;
                        outputNumbSwitch(j,5);
                        String out5 = output;
                        int num5 = numb;
                        for (int k = 0; k < 4;k++)
                        {
                            output = out5;
                            numb = num5;
                            outputNumbSwitch(k,6);
                            if (numb == 35)
                            {
                                count++;
                                System.out.println(output);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Количество решений: " + count);


    }

}
