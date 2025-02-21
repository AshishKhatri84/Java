import java.util.*;
class ListExample{
    public static void main (String[] args){
       
        // ArrayList
        ArrayList <String> al= new ArrayList<>();
        al.add("Ash");
        al.add("Ashu");
        Iterator<String> itr1=al.iterator();
        while(itr1.hasNext()){
        System.out.println(itr1.next());}
       
        // LinkedList
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Ash");
        ll.add("Ashu");
        Iterator<String> itr2=ll.iterator();
        while(itr2.hasNext()){
        System.out.println(itr2.next());

        // Vector
        Vector<String> v=new Vector<>();
        v.add("Ayush");  
        v.add("Amit");  
        v.add("Ashish");  
        v.add("Garima"); 
        Iterator<String> itr3=v.iterator();
        while(itr3.hasNext()){
        System.out.println(itr3.next());

        // Stack
        Stack<String> s = new Stack<>();  
        s.push("Ayush");  
        s.push("Garvit");  
        s.push("Amit");  
        s.push("Ashish");  
        s.push("Garima");  
        s.pop();  
        Iterator<String> itr4=s.iterator();  
        while(itr4.hasNext()){  
        System.out.println(itr4.next());
        
        // Priority Queue
        PriorityQueue<String> pq=new PriorityQueue<>();  
        pq.add("Amit Sharma");  
        pq.add("Vijay Raj");  
        pq.add("JaiShankar");  
        pq.add("Raj");  
        System.out.println("head:"+pq.element());  
        System.out.println("head:"+pq.peek());  
        System.out.println("iterating the queue elements:");  
        @SuppressWarnings("rawtypes")
        Iterator itr5=pq.iterator();  
        while(itr5.hasNext()){  
        System.out.println(itr5.next());  }  
        
        pq.remove();  
        pq.poll();  
        System.out.println("after removing two elements:");  
        Iterator<String> itr6=pq.iterator();  
        while(itr6.hasNext()){  
        System.out.println(itr6.next()); 

        // Deque
        Deque<String> dq = new ArrayDeque<>();  
        dq.add("Gautam");  
        dq.add("Karan");  
        dq.add("Ajay");   
        for (String str : dq) {  
        System.out.println(str);

        // HashSet
        HashSet<String> hs=new HashSet<>();  
        hs.add("Ravi");  
        hs.add("Vijay");  
        hs.add("David");  
        hs.add("Jack");  
        Iterator<String> itr7=hs.iterator();  
        while(itr7.hasNext()){  
        System.out.println(itr7.next());

        // LinkedHashSet
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Ravi");  
        lhs.add("Vijay");  
        lhs.add("David");  
        lhs.add("Jack");  
        Iterator<String> itr8=lhs.iterator();  
        while(itr8.hasNext()){  
        System.out.println(itr8.next());

        // TreeSet
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Ravi");  
        ts.add("Vijay");  
        ts.add("David");  
        ts.add("Jack");  
        Iterator<String> itr9=ts.iterator();  
        while(itr9.hasNext()){  
        System.out.println(itr9.next()); 
}}}}}}}}}}