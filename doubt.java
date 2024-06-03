// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s="10*9/8+7-6*5/4+3-2*1";
       // String[] strs=new String[s.length()];
       
       ArrayList<String> exp1=new ArrayList<>();
       int n=7;
       
       exp1.add(7);
       
       String un="";
       un+=1;
       System.out.println("THIS IS TESTING:"+un);
       
       
       
       
       
       
       
       Stack<String> op=new Stack<>();
       exp1.add(Integer.toString(n));
       
       ArrayList<String> list=new ArrayList<>();
        int tracker=0;
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*'||s.charAt(i)=='-'||s.charAt(i)=='+'||s.charAt(i)=='/')
            {
                //strs[k]=s.substring(tracker,i);
                list.add(s.substring(tracker,i));
                String temp="";
                temp+=s.charAt(i);
              list.add(temp);
                tracker=i+1;
            }
          
        }
        String t2="";
        t2+=s.charAt(s.length()-1);
    list.add(t2);
        System.out.println(list);
      
      
      Stack<String> stack=new Stack<>();
      //String exp2="";
      HashMap<String,Integer> map=new HashMap<>();
      map.put("*",4);
      map.put("/",4);
      map.put("+",2);
      map.put("-",2);
      ArrayList<String> exp2=new ArrayList<>();
      for(int i=0;i<list.size();i++)
      {
          if(!list.get(i).equals("*")&&!list.get(i).equals("+")&&!list.get(i).equals("/")&&!list.get(i).equals("-"))
          {
              //exp2+=list.get(i);
              exp2.add(list.get(i));
          }
          else
          {	
              if(stack.isEmpty()||map.get(list.get(i))>map.get(stack.peek()))
              {
                  stack.push(list.get(i));
              }
              else
              {
                  while(map.get(list.get(i))==map.get(stack.peek())||map.get(list.get(i))<map.get(stack.peek()))
                  {
                        String temp2=stack.pop();
                     //exp2+=temp2;
                     exp2.add(temp2);
                        if(stack.isEmpty())
                      {
                          stack.push(list.get(i));
                          break;
                      }
                      if(map.get(list.get(i))>map.get(stack.peek()))
                      {
                          stack.push(list.get(i));
                          break;
                      }
                    
                    
                  }
                  
              }
          }
          
      }
      while(!stack.isEmpty())
      {
     // exp2=exp2+stack.pop();
     exp2.add(stack.pop());
      }
      
      Stack<String> stack2=new Stack<>();
      for(int i=0;i<exp2.size();i++)
      {
      		if(!exp2.get(i).equals("*")&&!exp2.get(i).equals("-")&&!exp2.get(i).equals("/")&&!exp2.get(i).equals("+"))
      		{
      			stack2.push(exp2.get(i));
      		}
      		else
      		{
      			int a=Integer.parseInt(stack2.pop());
      			int b=Integer.parseInt(stack2.pop());
      			String op=exp2.get(i);
      			String res="";
      			if(op.equals("*"))
      			{
      				res=Integer.toString(b*a);
      				stack2.push(res);
      			}
      			else if(op.equals("/"))
      			{
      				res=Integer.toString(b/a);
      				stack2.push(res);
      			}
      			else if(op.equals("-"))
      			{
      				res=Integer.toString(b-a);
      				stack2.push(res);
      			}
      			else
      			{
      				res=Integer.toString(b+a);
      				stack2.push(res);
      			}
      		}
      }
      
      System.out.println(exp2);
      System.out.println(stack2.peek());
    }
}
