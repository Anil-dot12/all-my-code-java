import java. util. Stack;
public class BrowserHistory {
    private Stack<String> history = new Stack<>();
    public void visitPage( String url)  {
        history. push( url);
        System. out. println( "Visiting webpage: " + url);    
        printStackStatus();    }
    
       public void back()  {
        if  ( history. size()  <= 1)  {
            System. out. println( "Cannot go back further. Already at the beginning.");  
            }  else {
            history. pop();      
            String previousPage = history. peek(); 
            System. out. println( "Navigating back to: " + previousPage);}
        printStackStatus();    }

    private void printStackStatus()  {
        System. out. println( "Stack status: " + history);    }
    
    
    public static void main( String[]  args)  {
        BrowserHistory browser = new BrowserHistory();
        browser. visitPage( "https://www.stc.com/content/stcgroupwebsite/sa/en/who-we-are.html");      
        browser. visitPage( "https://owa.moh.gov.sa/my.policy"); 
        browser. visitPage( "https://moe.gov.sa/en/Pages/default.aspx");
        browser. back();       
        browser. back();   
        browser. back();    }
}
