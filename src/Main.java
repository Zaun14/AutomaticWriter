
import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    private static Robot rob;

    public static void main(String[] args) {
        try {
            rob = new Robot();
            while (true) {
                writeMessage("https://github.com/Zaun14/AutomaticWriterBot" , false , 40);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void writeMessage(String msg , boolean isCapslock, int sleepTime) throws InterruptedException {
        if (isCapslock) {
            rob.keyPress(KeyEvent.VK_CAPS_LOCK);
            rob.keyRelease(KeyEvent.VK_CAPS_LOCK);
            for (int i = 0; i < msg.length(); i++) {
                if (!Character.isLetter(msg.charAt(i)) && !Character.isDigit(msg.charAt(i))){
                    writeSymbol(msg.charAt(i));
                }else {
                    int temp = writeLetter(msg.toLowerCase().charAt(i));
                    if (Character.isUpperCase(msg.charAt(i))) {
                        rob.keyPress(KeyEvent.VK_SHIFT);
                        rob.keyPress(temp);
                        rob.keyRelease(temp);
                        rob.keyRelease(KeyEvent.VK_SHIFT);
                    }else {
                        rob.keyPress(temp);
                        rob.keyRelease(temp);
                    }
                }
            }
            rob.keyPress(KeyEvent.VK_ENTER);
            rob.keyRelease(KeyEvent.VK_ENTER);
            rob.keyPress(KeyEvent.VK_CAPS_LOCK);
            rob.keyRelease(KeyEvent.VK_CAPS_LOCK);
        }else{
            for (int i = 0; i < msg.length(); i++) {
                if (!Character.isLetter(msg.charAt(i)) && !Character.isDigit(msg.charAt(i))){
                    writeSymbol(msg.charAt(i));
                }else {
                    int temp = writeLetter(msg.toLowerCase().charAt(i));
                    if (Character.isUpperCase(msg.charAt(i))) {
                        rob.keyPress(KeyEvent.VK_SHIFT);
                        rob.keyPress(temp);
                        rob.keyRelease(temp);
                        rob.keyRelease(KeyEvent.VK_SHIFT);
                    }else {
                        rob.keyPress(temp);
                        rob.keyRelease(temp);
                    }
                }
            }
            rob.keyPress(KeyEvent.VK_ENTER);
            rob.keyRelease(KeyEvent.VK_ENTER);

        }
        Thread.sleep(sleepTime);
    }

    private static int writeLetter(char msg ) {
        int temparu = 0;
        switch (msg) {
            case 'q':
                temparu = KeyEvent.VK_Q;
                break;
            case 'w':
                temparu = KeyEvent.VK_W;
                break;
            case 'e':
                temparu = KeyEvent.VK_E;
                break;
            case 'r':
                temparu = KeyEvent.VK_R;
                break;
            case 't':
                temparu = KeyEvent.VK_T;
                break;
            case 'y':
                temparu = KeyEvent.VK_Y;
                break;
            case 'u':
                temparu = KeyEvent.VK_U;
                break;
            case 'i':
                temparu = KeyEvent.VK_I;
                break;
            case 'o':
                temparu = KeyEvent.VK_O;
                break;
            case 'p':
                temparu = KeyEvent.VK_P;
                break;
            case 'a':
                temparu = KeyEvent.VK_A;
                break;
            case 's':
                temparu = KeyEvent.VK_S;
                break;
            case 'd':
                temparu = KeyEvent.VK_D;
                break;
            case 'f':
                temparu = KeyEvent.VK_F;
                break;
            case 'g':
                temparu = KeyEvent.VK_G;
                break;
            case 'h':
                temparu = KeyEvent.VK_H;
                break;
            case 'j':
                temparu = KeyEvent.VK_J;
                break;
            case 'k':
                temparu = KeyEvent.VK_K;
                break;
            case 'l':
                temparu = KeyEvent.VK_L;
                break;
            case 'z':
                temparu = KeyEvent.VK_Z;
                break;
            case 'x':
                temparu = KeyEvent.VK_X;
                break;
            case 'c':
                temparu = KeyEvent.VK_C;
                break;
            case 'v':
                temparu = KeyEvent.VK_V;
                break;
            case 'b':
                temparu = KeyEvent.VK_B;
                break;
            case 'n':
                temparu = KeyEvent.VK_N;
                break;
            case 'm':
                temparu = KeyEvent.VK_M;
                break;
            case'1':
                temparu = KeyEvent.VK_1;
                break;
            case'2':
                temparu = KeyEvent.VK_2;
                break;
            case'3':
                temparu = KeyEvent.VK_3;
                break;
            case'4':
                temparu = KeyEvent.VK_4;
                break;
            case'5':
                temparu = KeyEvent.VK_5;
                break;
            case'6':
                temparu = KeyEvent.VK_6;
                break;
            case'7':
                temparu = KeyEvent.VK_7;
                break;
            case'8':
                temparu = KeyEvent.VK_8;
                break;
            case'9':
                temparu = KeyEvent.VK_9;
                break;

            case ' ':
                temparu = KeyEvent.VK_SPACE;
                break;
        }
        return temparu;
    }


    private static void writeSymbol(char  sym){
        switch (sym){
            case ':':
                rob.keyPress(KeyEvent.VK_SHIFT);
                rob.keyPress(KeyEvent.VK_SEMICOLON);
                rob.keyRelease(KeyEvent.VK_SEMICOLON);
                rob.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case ',':
                rob.keyPress(KeyEvent.VK_COMMA);
                rob.keyRelease(KeyEvent.VK_COMMA);
                break;
            case ';':
                rob.keyPress(KeyEvent.VK_SEMICOLON);
               rob.keyRelease (KeyEvent.VK_SEMICOLON);
                break;
            case '\'':
                rob.keyPress(222);
                rob.keyRelease (222);
                break;
            case '.':
                rob.keyPress(46);
                rob.keyRelease(46);
                break;
            case '\\':
                rob.keyPress(KeyEvent.VK_BACK_SLASH);
                rob.keyRelease(KeyEvent.VK_BACK_SLASH);
                break;
            case '/':
                rob.keyPress(KeyEvent.VK_SLASH);
                rob.keyRelease(KeyEvent.VK_SLASH);
        }
    }
}