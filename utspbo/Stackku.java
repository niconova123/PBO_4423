import java.util.Scanner;
import java.util.Stack;

public class Stackku {
    public static void main(String[] args) {
        Stack<Character> leftChar =  new Stack<Character>();
        boolean Validd,InRight,isFoundEqual,NotValidChar,NotValidEqual;
        Validd = true;
        InRight = false;
        isFoundEqual = false;
        NotValidChar = false;
        NotValidEqual = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan inputan persamaan = ");
        String equation = String.join("", input.nextLine().split(" "));
        for (int index = 0; index < equation.length(); index++) {
            char ch = equation.charAt(index);
            if(ch != '1' && ch != '+' && ch != '=') {
                NotValidChar = true;
                break;
            }
            if(ch == '+'){
                continue;
            }
            if(ch == '=' ) {
                if(isFoundEqual) {
                    NotValidEqual = true;
                    break;
                }
                isFoundEqual = true;
                InRight = true;
                continue;
            }
            if(!InRight) {
                leftChar.add(ch);
            }
            if(InRight) {
                if(
                    leftChar.size() == 0 || (leftChar.size() > 1 && index == (equation.length() - 1))
                ) {
                    Validd = false;
                    break;
                } else {
                    leftChar.pop();
                }
            }
        }
        if(!isFoundEqual) {
            System.out.println("Bukan sebuah persamaan karena tidak ada tanda sama dengan(=)");
        }
        else if(NotValidChar) {
            System.out.println("Tidak valid karena karakter yang dijinkan hanya 1, +, dan =");
        }
        else if (NotValidEqual) {
            System.out.println("Tidak valid karena hanya satu tanda sama dengan yang diijinkan");
        }
        else if(Validd) {
            System.out.println("Valid");
        } else {
            System.out.println("Tidak valid");
        }
    }
}
