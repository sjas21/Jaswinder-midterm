/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
   public void statusDetail(String code)
{
    
    
public enum UserStatus {
    REJECTED,
    PENDING,
    PROCESSING,
    APPROVED,
    NOT VALID CODE;
}

switch(code.toUpperCase())
        {
        case "ZERO": System.out.println(UserStatus.get(0));
        break;
        case "ONE": System.out.println(UserStatus.get(1));
        break;
        case "TWO":
        System.out.println(UserStatus.get(2));
        break;
        case "THREE": 
            System.out.println(UserStatus.get(3));
        break;
        default:
         System.out.println(UserStatus.get(4));
        break;
        }
}
 
}
