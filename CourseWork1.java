
//============================================================================
// Name        : Pang Linze
// Author      : Pang Linze
// Version     : Version 1.0.0
// Copyright   : Copyright (c) 2021 Pang Linze
// Description : A Calculator Based On binary operation and with small range 
//============================================================================
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CourseWork1 extends JFrame {

  public static int sum = 0;
  public static JTextArea textArea;// instantiation,
  public static int r = 0;
  public static int Overflow = 0;// OF
  public static int ZeroFlag = 0;// ZF
  public static int SignFlag = 0;// SF
  public static int CF = 0;

  public static void JudgeSignal() {
    String str = textArea.getText();
    String[] stringArr = str.split((" "));
    if (stringArr[0].equals("-")) {// neagtive number begin plus or sub situation

      int i = Integer.valueOf(stringArr[1]);// turn it to int;
      i = 0 - i;// take neg num
      sum = add(sum, i);// sum is the 1st number

    }
    if (stringArr.length == 2) {
      int i = Integer.valueOf(stringArr[0]);
      sum = i;

    } else if (stringArr[stringArr.length - 3].equals("+")) {// 1+1=
      int i = Integer.valueOf(stringArr[stringArr.length - 2]);
      sum = add(sum, i);// sum is the 1st number
    }

    else if (stringArr[stringArr.length - 3].equals("-")) {

      int i = Integer.valueOf(stringArr[stringArr.length - 2]);
      sum = substract(sum, i);

    } else if (stringArr[stringArr.length - 3].equals("*")) {
      int i = Integer.valueOf(stringArr[stringArr.length - 2]);
      sum = multiply(sum, i);
    } else if (stringArr[stringArr.length - 3].equals("/")) {
      int i = Integer.valueOf(stringArr[stringArr.length - 2]);
      sum = divide(sum, i);

    }

  }

  public static void ButtonOperation() {
    JFrame frame = new JFrame("JAVA calculator Based on Binary operation");// title

    JButton Button = new JButton("1");

    Button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        textArea.setText(textArea.getText() + 1);

      }
    });
    Button.setBounds(70, 265, 50, 26);
    frame.getContentPane().add(Button);

    JButton button0 = new JButton("2");
    button0.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        textArea.setText(textArea.getText() + 2);

      }
    });
    button0.setBounds(144, 265, 50, 26);
    frame.getContentPane().add(button0);

    JButton button_1 = new JButton("3");
    button_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        textArea.setText(textArea.getText() + 3);

      }
    });
    button_1.setBounds(221, 265, 50, 26);
    frame.getContentPane().add(button_1);

    JButton button_2 = new JButton("4");
    button_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        textArea.setText(textArea.getText() + 4);

      }
    });
    button_2.setBounds(70, 304, 50, 26);
    frame.getContentPane().add(button_2);

    JButton button_3 = new JButton("5");
    button_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        textArea.setText(textArea.getText() + 5);

      }
    });
    button_3.setBounds(144, 304, 50, 26);
    frame.getContentPane().add(button_3);

    JButton button_4 = new JButton("6");
    button_4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        textArea.setText(textArea.getText() + 6);

      }
    });
    button_4.setBounds(221, 304, 50, 26);
    frame.getContentPane().add(button_4);

    JButton button_5 = new JButton("7");
    button_5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        textArea.setText(textArea.getText() + 7);

      }
    });
    button_5.setBounds(70, 339, 50, 26);
    frame.getContentPane().add(button_5);

    JButton button_6 = new JButton("8");
    button_6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        textArea.setText(textArea.getText() + 8);

      }
    });
    button_6.setBounds(144, 339, 50, 26);
    frame.getContentPane().add(button_6);

    JButton button_7 = new JButton("9");
    button_7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        textArea.setText(textArea.getText() + 9);

      }
    });
    button_7.setBounds(221, 339, 50, 26);
    frame.getContentPane().add(button_7);

    // add///////////////////////////////////////////////////////////////////
    JButton button_8 = new JButton("+");
    button_8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textArea.setText(textArea.getText() + " + ");// just display on screen. No function
        // add
        JudgeSignal();
      }
    });
    button_8.setBounds(293, 265, 50, 26);
    frame.getContentPane().add(button_8);
    // sub/////////////////////////////////////////////////////////////////////////////////
    JButton button_9 = new JButton("-");
    button_9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textArea.setText(textArea.getText() + " - ");
        JudgeSignal();

        // sub
      }
    });
    button_9.setBounds(293, 304, 50, 26);
    frame.getContentPane().add(button_9);

    // mult//////////////////////////////////////////////////////////////////
    JButton button_10 = new JButton("*");
    button_10.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textArea.setText(textArea.getText() + " * ");
        JudgeSignal();
      }
    });
    button_10.setBounds(293, 339, 50, 26);
    frame.getContentPane().add(button_10);

    JButton button_11 = new JButton("0");
    button_11.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        textArea.setText(textArea.getText() + 0);
      }
    });
    button_11.setBounds(144, 380, 50, 26);
    frame.getContentPane().add(button_11);
    // div//////////////////////////////////////////////////////////////////
    JButton button_12 = new JButton("/");
    button_12.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textArea.setText(textArea.getText() + " / ");
        JudgeSignal();
      }
    });
    button_12.setBounds(293, 380, 50, 26);
    frame.getContentPane().add(button_12);

    JButton button_13 = new JButton("=");
    button_13.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textArea.setText(textArea.getText() + " = ");
        String str = textArea.getText();
        String[] stringArr = str.split((" "));// cut off the space

        if (stringArr.length == 2) {// a=a
          int i = Integer.valueOf(stringArr[0]);
          sum = i;
          if (sum > 128 || sum < -127) {
            Overflow = 1;
            // record Overflow
          }
          if (sum == 0) {// record zeroflag
            ZeroFlag = 1;
          }
          if (sum < 0) {
            SignFlag = 1;
          }
          if (sum > 255) {
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + "ERROR" + "\r\nOverflow: " + Overflow
                + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          } else {
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + ConvertDemToBina(sum) + "\r\nOverflow: "
                + Overflow + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          }
        } else if (stringArr[stringArr.length - 3].equals("+")) {// 1"+"1=
          int i = Integer.valueOf(stringArr[stringArr.length - 2]);// 1+"1"=
          sum = add(sum, i);// i is the 2nd number, sum is 1st num
          if (sum > 128 || sum < -127) {
            Overflow = 1;
            // record Overflow
          }
          if (sum == 0) {
            ZeroFlag = 1;
          }
          if (sum < 0) {
            SignFlag = 1;
          }
          if (sum > 255) {
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + "ERROR" + "\r\nOverflow: " + Overflow
                + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          } else {
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + ConvertDemToBina(sum) + "\r\nOverflow: "
                + Overflow + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          }
        } else if (stringArr[stringArr.length - 3].equals("-")) {

          int i = Integer.valueOf(stringArr[stringArr.length - 2]);
          sum = substract(sum, i);
          if (sum > 128 || sum < -127) {
            Overflow = 1;
            // record Overflow
          }
          if (sum == 0) {
            ZeroFlag = 1;
          }
          if (sum < 0) {
            SignFlag = 1;
          }
          if (sum > 255) {
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + "ERROR" + "\r\nOverflow: " + Overflow
                + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          } else {
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + ConvertDemToBina(sum) + "\r\nOverflow: "
                + Overflow + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          }
        } else if (stringArr[stringArr.length - 3].equals("*")) {
          int i = Integer.valueOf(stringArr[stringArr.length - 2]);
          sum = multiply(sum, i);

          if (sum == 0) {
            ZeroFlag = 1;
          }
          if (sum < 0) {
            SignFlag = 1;
          }
          if (sum > 128 || sum < -127) {
            Overflow = 1;
          }
          if (sum > 255 || sum < -255) {

            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + "ERROR" + "\r\nOverflow: " + Overflow
                + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          } else {
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + ConvertDemToBina(sum) + "\r\nOverflow: "
                + Overflow + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          }
        } else if (stringArr[stringArr.length - 3].equals("/")) {

          int i = Integer.valueOf(stringArr[stringArr.length - 2]);
          sum = divide(sum, i);

          if (sum == 0) {
            ZeroFlag = 1;
          }
          if (sum < 0) {
            SignFlag = 1;
          }
          if (sum > 2147483645) {// special value for this situation
            textArea.setText(textArea.getText() + "The divisor cannot be 0" + "\r\nBinary:" + "ERROR" + "\r\nOverflow: "
                + Overflow + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          } else if (sum > 128 && sum < 256) {
            Overflow = 1;
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + ConvertDemToBina(sum) + "\r\nOverflow: "
                + Overflow + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          } else if (sum < -127) {
            Overflow = 1;
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + ConvertDemToBina(sum) + "\r\nOverflow: "
                + Overflow + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          } else if (sum > 255 || sum < -255) {
            Overflow = 1;
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + "ERROR" + "\r\nOverflow: " + Overflow
                + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          } else {
            textArea.setText(textArea.getText() + sum + "\r\nBinary:" + ConvertDemToBina(sum) + "\r\nOverflow: "
                + Overflow + "\r\nZeroflag:" + ZeroFlag + "     Signflag:" + SignFlag);
            sum = 0;// initialize
            SignFlag = 0;
            CF = 0;
            Overflow = 0;
            ZeroFlag = 0;
          }
        }

        /*
         * read the array and judge the singal and do the respond operation
         */

      }
    });
    button_13.setBounds(364, 265, 50, 26);
    frame.getContentPane().add(button_13);

    textArea = new JTextArea();
    textArea.setBounds(70, 148, 344, 79);
    frame.getContentPane().add(textArea);
    textArea.setColumns(10);

    JButton btnC = new JButton("C");
    btnC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textArea.setText("");

      }
    });
    btnC.setBounds(364, 304, 50, 26);
    frame.getContentPane().add(btnC);

    frame.setBounds(100, 100, 600, 650);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close when exit
    frame.getContentPane().setLayout(null);// absolute arrangement
    frame.setVisible(true);// display

  }

  ////////////////////////////////////////////////////////////////////////////////////

  public static String ConvertDemToBina(int num) {// Out of the reason that the range is -128~128, hence we use only 8
                                                  // digit and convert it into int type

    int[] a = new int[8];
    Arrays.fill(a, 0);
    int i = 0;
    int k = 0;// the number of binary
    if (num >= 0) {
      if (num > 255)// cherish it, a magic method
        num -= 255;// the situation for no sign but didnt apply,but too magic to delete it
      while (num > 0) {
        a[i] = num % 2;
        i = i + 1;
        num = num / 2;
      } // Divide by 2 to get the remainder

      int ans = 10000000;
      for (int j = 7; j >= 0; j--) {
        k += a[j] * ans;
        ans /= 10;
      }

      String s = String.valueOf(k);// convert k from int to string such as , 5 is 101 .
      int len = s.length();// such as 5 's length is 3
      char[] zero = new char[9 - len];
      for (int cnt = 1; cnt < 9 - len; cnt++) {
        zero[cnt - 1] = '0';
      } // sup0

      String ans1 = new String(zero);
      ans1 = ans1.concat(s);// ans is zero concat is the binary number
      return ans1;
    }
    //////////////////////// negative number situation///////////////////////
    else {
      num = 0 - num;// take convert
      if (num < -255)// the situation for no sign but didnt apply
        num += 255;// too magic for me to delete it,cherish it
      while (num > 0) {
        a[i] = num % 2;
        i = i + 1;
        num = num / 2;
      } // Divide by 2 to get the remainder, take original code of num;
      int ans = 10000000;

      for (int j = 7; j >= 0; j--) {
        k += a[j] * ans;
        ans /= 10;
      }
      String s = String.valueOf(k);// convert k from int to string such as , 5 is 101 .
      int len = s.length();// such as 5 's length is 3
      char[] zero = new char[9 - len];
      for (int cnt = 1; cnt < 9 - len; cnt++) {
        zero[cnt - 1] = '0';
      } // sup0

      String ans1 = new String(zero);
      ans1 = ans1.concat(s);// ans is zero concat is the binary number
      ///////// above part same with positive num situation~to complite 0 to begin

      char[] cnt = ans1.toCharArray();// turn ans1 to char type

      for (int m = 0; m < 9; m++) {
        if (cnt[m] == '0') {
          cnt[m] = '1';
        } else if (cnt[m] == '1') {
          cnt[m] = '0';
        } // convert 1 to 0, 0 to 1
      } // take convert code
        // cnt is convert code
      if (cnt[8] == '0') {
        cnt[8] = '1';
      } else if (cnt[8] == '1') {// the last bit is 1
        for (int n = 8; n > 0; n--) {
          if (cnt[n] == '0') {
            cnt[n] = '1';// jugde carry
            int record = n;// recode the location of bit of 0
            for (n = 8; n > record; n--) {
              cnt[n] = '0';// replace the carry bit into 0
            }
            break;
            /*
             * find this(0):00001100~ 11110(0)11~~from 011 to 100~~replace later 1 to0,0to1
             */
          }

        }

      } // convert convert code to 2's compliment
      String ans2 = new String(cnt);
      return ans2;

    }

  }

  public static int add(int a, int b) {
    int add1 = 0, carry = 0;
    do {// at least 1 cal
      add1 = (a ^ b);
      carry = (a & b) << 1;// find zero position and add it on then jump out the circulation
      a = add1;
      b = carry;
    } while (carry != 0);// carry big than 0, in the next turn of cal

    return add1;
  }

  public static int substract(int a, int b) {
    int ans = add(~b, 1);// 2's complement---such as , 5 is 0101,~5 = 1010 = -6, -6+1 = -5
    return add(a, ans);
  }

  public static int multiply(int a, int b) {
    int sum = 0;
    Map<Integer, Integer> bit_map = new HashMap<>();
    for (int i = 0; i < 9; i++)// list all situation to have high effect
      bit_map.put(1 << i, i);// push 1,10,100,1000,10000,100000,1000000,10000000 into table
    while (b > 0) {// ALU has shifter so we dont do functions to realize shift operation
      int last_bit = bit_map.get(b & ~(b - 1));// b& -b , get the last "1" of b
                                               // a=3,b=7, 011*0111 = 0111*0001+0111<<10=0111+1110 = 10101
      sum = add(sum, (a << last_bit));// such as 011<<1 = 011+(011<<10 = 110)=1001,+011<<100=1100=10101 finally
      b &= b - 1;// eliminate the last "1" of b
    }
    return sum;
  }

  public static int divide(int a, int b) {// same theorem with multiply,just instead add to substract
    boolean neg = (a > 0) ^ (b > 0);
    if (a < 0)
      a = -a;
    if (b < 0)
      b = -b;
    if (a < b)
      return 0;
    if (b == 0)
      return 2147483647;// special value for this situaion
    int loc = 0;
    for (loc = 0; loc < 9; loc++) {
      if ((b << loc) >= a)// find the highest bit location of a
        break;
    }
    int q = 0;
    for (int i = loc; i >= 0; i--) {
      if ((b << i) > a)// make sure b has same 1 bits with a
        continue;
      q |= (1 << i);// if b=0,q=111111111=1023
      a = substract(a, (b << i));
    }
    if (neg)
      return -q;
    return q;

  }

  public static void main(String[] args) {
    ButtonOperation();
  }
}
