package project.Learingpckg;
import java.util.Random;
import java.util.Scanner;
public class HangMan 
{
public static void main(String[] args) 
     {
    // TODO Auto-generated method stub
    String [] arr ={"laptop","mobile","mouse","camera","wifi","internet"}; //1)Creating String array and storing words.
        Random rd=new Random();    
    String word=arr[rd.nextInt(arr.length)];  //2)Generating word randomly from String array .
    //String word="laptop";
    System.out.println(word);
      System.out.println(word.length());
      char [] ch=new char[word.length()];       //3)Declaring char array with the length of generated random word.
      for(int i=0;i<word.length();i++) 
        {
          ch[i]='_';                         //{'_','_','_','_','_','_'} 4)filling char array with _'s.
          System.out.print(ch[i]+" ");                                   //giving to user _'s ,to show number of letters in words.
        }
      System.out.println("you will be provided with 10 Chances ");      //5)informing number of chances to user.
      searchingChar(word,ch);      
   }
    private static void searchingChar(String word, char[] ch) 
    {
      // TODO Auto-generated method stub
      int chance=1;
      Scanner sc= new Scanner(System.in);
      int j;
      while(chance<=10)                                             //fixing chances as condition.
      {                 
        System.out.print("Enter Your Choice:");
          char key=sc.next().charAt(0);                               //6)getting character form user.
          for(j=0;j<word.length();j++)
        {   if(ch[j]=='_')          
            {                       
           if(key==word.charAt(j))                     //7)comparing with each letter in word, if matches then assigning to character array with corresponding index.
           {
            ch[j]=key;          
            break;              
           }
            }
        }
        for(int k=0;k<word.length();k++)
        {
          System.out.print(ch[k]+" ");                  //8)showing character array to user.
        }
               String chstr= new String(ch);                      //9)converting character array into String, so that easy to check two Strings are equal or not.
      
    if(chance>=word.length())                                 
    {
      if(word.equals(chstr))                                //10) comparing two Strings using equals() method and printing result. 
          {
        System.out.println("U Won/Equal");                
        break;
          }
      else
      {  if(chance==10)
         {
        System.out.println("U Lost/Notequal");
         }
      }
    }
    chance++;
      }
      
     }
  
}