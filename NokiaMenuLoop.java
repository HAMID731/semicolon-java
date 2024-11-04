import java.util.Scanner;

public class NokiaMenuLoop{

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int mainMenuOption;

        do {
            System.out.print("Select a menu :\n1. Phone book\n2. Message\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call Divert\n8. Games\n9. Calculator\n10. Reminder\n11. Clock\n12. Profiles\n>>>>>>>>");
            mainMenuOption = scan.nextInt();

            switch(mainMenuOption){
                case 1 :
                    System.out.println("Phone book");
                    int answerOne;
                    do {
                        System.out.print("1. Search\n2. Service Nos.\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags\n11. Back to main menu\n>>>>>>>>");
                        answerOne = scan.nextInt();
                        switch(answerOne){
                            case 1 : System.out.println("Search"); break;
                            case 2 : System.out.println("Service Nos"); break;
                            case 3 : System.out.println("Add Name"); break;
                            case 4 : System.out.println("Erase"); break;
                            case 5 : System.out.println("Edit"); break;
                            case 6 : System.out.println("Assign tone"); break;
                            case 7 : System.out.println("Send b'card"); break;
                            case 8 : 
                                System.out.println("Options");
                                System.out.print("1. Type of view\n2. Memory status\n>>>>>>>>");
                                int answerOneEight = scan.nextInt();
                                switch(answerOneEight){
                                    case 1 : System.out.println("Type of view"); break;
                                    case 2 : System.out.println("Memory Status"); break;
                                }
                                break;
                            case 9 : System.out.println("Speed dials"); break;
                            case 10 : System.out.println("Voice tags"); break;
                        }
                    } while (answerOne != 11);
                    break;

                case 2 :
                    System.out.println("Messages");
                    int answerTwo;
                    do {
                        System.out.print("1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message Settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor\n11. Back to main menu\n>>>>>>>>");
                        answerTwo = scan.nextInt();
                        switch(answerTwo){
                            case 1 : System.out.println("Write messages"); break;
                            case 2 : System.out.println("Inbox"); break;
                            case 3 : System.out.println("Outbox"); break;
                            case 4 : System.out.println("Picture messages"); break;
                            case 5 : System.out.println("Templates"); break;
                            case 6 : System.out.println("Smileys"); break;
                            case 7 : 
                                System.out.println("Message Settings");
                                System.out.print("1. Set 1\n2. Common\n>>>>>>>>");
                                int answerOneSeven = scan.nextInt();
                                switch(answerOneSeven){
                                    case 1 : 
                                        System.out.print("1. Message center number\n2. Message sent as\n3. Message validity\n>>>>>>>>");
                                        int answerOneFive = scan.nextInt();
                                        switch(answerOneFive){
                                            case 1 : System.out.println("Message center number"); break;
                                            case 2 : System.out.println("Message sent as"); break;
                                            case 3 : System.out.println("Message validity"); break;
                                        }
                                        break;
                                    case 2 : 
                                        System.out.print("1. Delivery report\n2. Reply via same centre\n3. Character support\n>>>>>>>>");
                                        int answerOneSix = scan.nextInt();
                                        switch(answerOneSix){
                                            case 1 : System.out.println("Delivery report"); break;
                                            case 2 : System.out.println("Reply via same centre"); break;
                                            case 3 : System.out.println("Character support"); break;
                                        }
                                        break;
                                }
                                break;
                            case 8 : System.out.println("Info service"); break;
                            case 9 : System.out.println("Voice mailbox number"); break;
                            case 10 : System.out.println("Service command editor"); break;
                        }
                    } while (answerTwo != 11);
                    break;

                case 3 :
                    System.out.print("Chat\n>>>>>>");
                    int answerThree = scan.nextInt();
                    switch(answerThree){
                        case 1 : System.out.println("Chat"); break;
                    }
                    break;

                case 4 :
                    System.out.println("Call Register");
                    int answerFour;
                    do {
                        System.out.print("1. Missed calls\n2. Received calls\n3. Dialled number\n4. Erase recent call list\n5. Show call duration\n6. Show call cost\n7. Call cost Settings\n8. Prepaid credit\n9. Back to main menu\n>>>>>>>>");
                        answerFour = scan.nextInt();
                        switch(answerFour){
                            case 1 : System.out.println("Missed calls"); break;
                            case 2 : System.out.println("Received calls"); break;
                            case 3 : System.out.println("Dialled number"); break;
                            case 4 : System.out.println("Erase recent call list"); break;
                            case 5 : 
                                System.out.println("Show call duration");
                                System.out.print("1. Last Call Duration\n2. All Call's Duration\n3. Received calls' Duration\n4. Dialled calls' duration\n5. Clear timers\n6. Back to main menu\n>>>>>>>>");
                                int answerOneNine = scan.nextInt();
                                switch(answerOneNine){
                                    case 1 : System.out.println("Last Call Duration"); break;
                                    case 2 : System.out.println("All Call's Duration"); break;
                                    case 3 : System.out.println("Received calls' Duration"); break;
                                    case 4 : System.out.println("Dialled calls' duration"); break;
                                    case 5 : System.out.println("Clear timers"); break;
                                }
                                break;

                            case 6 : 
                                System.out.println("Show call cost");
                                System.out.print("1. Last Call cost\n2. All calls' cost\n3. Clear counters\n4. Back to main menu\n>>>>>>>>");
                                int answerOneTen = scan.nextInt();
                                switch(answerOneTen){
                                    case 1 : System.out.println("Last Call cost"); break;
                                    case 2 : System.out.println("All Call's cost"); break;
                                    case 3 : System.out.println("Clear counters"); break;
                                }
                                break;

                            case 7 : 
                                System.out.println("Call cost Settings");
                                System.out.print("1. Call cost limit\n2. Show cost in\n3. Back to main menu\n>>>>>>>>");
                                int answerOneOne = scan.nextInt();
                                switch(answerOneOne){
                                    case 1 : System.out.println("Call Cost Limit"); break;
                                    case 2 : System.out.println("Show cost in"); break;
                                }
                                break;
                            case 8 : System.out.println("Prepaid credit"); break;
                        }
                    } while (answerFour != 9);
                    break;

                case 5 :
                    System.out.println("Tones");
                    int NumberFive;
                    do {
                        System.out.print("1. Ringing tone\n2. Ringing Volume\n3. Incoming Call Alert\n4. Composer\n5. Message Alert tone\n6. Keypad tone\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver\n10. Back to main menu\n>>>>>>>>");
                        NumberFive = scan.nextInt();
                        switch(NumberFive){
                            case 1 : System.out.println("Ringing tone"); break;
                            case 2 : System.out.println("Ringing volume"); break;
                            case 3 : System.out.println("Incoming Call alert"); break;
                            case 4 : System.out.println("Composer"); break;
                            case 5 : System.out.println("Message alert tone"); break;
                            case 6 : System.out.println("Keypad Tone"); break;
                            case 7 : System.out.println("Warning and game tones"); break;
                            case 8 : System.out.println("Vibrating alert"); break;            
                            case 9 : System.out.println("Screen Saver"); break;
                        }
                    } while (NumberFive != 10);
                    break;

                case 6 :
                    System.out.println("Settings");
                    int NumberSix;
                    do {
                        System.out.print("1. Call Settings\n2. Phone Settings\n3. Security Settings\n4. Restore factory\n5. Back to main menu\n>>>>>>>>");
                        NumberSix = scan.nextInt();
                        switch(NumberSix){
                            case 1 :
                                System.out.println("Call settings");
                                int NumberSixOne1;
                                do {
                                    System.out.print("1. Automatic redial\n2. Speed Dialling\n3. Call Waiting Option\n4. Own Number Sending\n5. Phone line in use\n6. Automatic Answer\n7. Back to settings menu\n>>>>>>>>");
                                    NumberSixOne1 = scan.nextInt();
                                    switch(NumberSixOne1){
                                        case 1 : System.out.println("Automatic redial"); break;
                                        case 2 : System.out.println("Speed Dialling"); break;
                                        case 3 : System.out.println("Call Waiting Option"); break;
                                        case 4 : System.out.println("Own Number Sending"); break;
                                        case 5 : System.out.println("Phone line in use"); break;
                                        case 6 : System.out.println("Automatic Answer"); break;
                                    }
                                } while (NumberSixOne1 != 7);
                                break;

                            case 2 :
                                System.out.println("Phone settings");
                                int NumberSixOne2;
                                do {
                                    System.out.print("1. Language\n2. Cell info Display\n3. Welcome Note\n4. Network Selection\n5. Light\n6. Confirm SIM Service Action\n7. Back to settings menu\n>>>>>>>>");
                                    NumberSixOne2 = scan.nextInt();
                                    switch(NumberSixOne2){
                                        case 1 : System.out.println("Language"); break;
                                        case 2 : System.out.println("Cell info Display"); break;
                                        case 3 : System.out.println("Welcome Note"); break;
                                        case 4 : System.out.println("Network Selection"); break;
                                        case 5 : System.out.println("Light"); break;
                                        case 6 : System.out.println("Confirm SIM Service Action"); break;
                                    }
                                } while (NumberSixOne2 != 7);
                                break;

                            case 3 :
                                System.out.println("Security settings");
                                int NumberSixOne3;
                                do {
                                    System.out.print("1. PIN code error\n2. Call barring Service\n3. Fix Dialls\n4. Closed User Group\n5. Phone Security\n6. Change Access Code\n7. Back to settings menu\n>>>>>>>>");
                                    NumberSixOne3 = scan.nextInt();
                                    switch(NumberSixOne3){
                                        case 1 : System.out.println("PIN code error"); break;
                                        case 2 : System.out.println("Call barring Service"); break;
                                        case 3 : System.out.println("Fix Dialls"); break;
                                        case 4 : System.out.println("Closed User Group"); break;
                                        case 5 : System.out.println("Phone Security"); break;
                                        case 6 : System.out.println("Change Access Code"); break;
                                    }
                                } while (NumberSixOne3 != 7);
                                break;

                            case 4 :
                                System.out.println("Restore Factory Settings");
                                break;
                        }
                    } while (NumberSix != 5);
                    break;

                case 7 :
                    System.out.println("Call Divert");
                    break;
                case 8 :
                    System.out.println("Games");
                    break;
                case 9 :
                    System.out.println("Calculator");
                    break;
                case 10:
                    System.out.println("Reminder");
                    break;
                case 11:
                    System.out.println("Clock");
                    int NumberSixOne4;
                    do {
                        System.out.print("1. Alarm clock\n2. Clock Settings\n3. Date Settings\n4. Stop Watch\n5. Countdown Timer\n6. Auto update of time and date\n7. Back to main menu\n>>>>>>>>");
                        NumberSixOne4 = scan.nextInt();
                        switch(NumberSixOne4){
                            case 1 : System.out.println("Alarm clock"); break;
                            case 2 : System.out.println("Clock Settings"); break;
                            case 3 : System.out.println("Date Settings"); break;
                            case 4 : System.out.println("Stop Watch"); break;
                            case 5 : System.out.println("Countdown Timer"); break;
                            case 6 : System.out.println("Auto update of time and date"); break;
                        }
                    } while (NumberSixOne4 != 7);
                    break;

                case 12:
                    System.out.println("Profiles");
                    break;
                case 13:
                    System.out.println("SIM Services");
                    break;
            }
        } while (mainMenuOption != 0);
    }
}
