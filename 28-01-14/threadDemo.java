import java.io.*;
class threadDemow implements Runnable
{
        String name,branch;
        int rno;
        Thread t;
        private volatile boolean running=true;
        public threadDemow(){}
        public threadDemow(int p)
        {
                t=new Thread(this);
                t.setPriority(p);
        }
        public void start()
        {
                t.start();
        }
        public void stop()
        {
                running=false;
        }
        public void set(String a,String b,int c)
        {
                rno=c;name=a;branch=b;
        }
        public void run()
        {
                try
                {
                File f=new File("Mad.txt");
                OutputStream fout=new FileOutputStream(f);
                String str="39\n"+"Hari\n"+"CSE";
                byte buf[]=str.getBytes();
                fout.write(buf);
                fout.close();
                }
                catch(Exception e)
                {
                        System.out.println("Writing interrupted");
                }
        }
}
class threadDemor implements Runnable
{
        private volatile boolean running=true;
        Thread t;
        public threadDemor(){}
        public threadDemor(int p)
        {
                t=new Thread(this);
                t.setPriority(p);
        }
        public void start()
        {
                t.start();
        }
        public void stop()
        {
                running=false;
        }
        public void run()
        {
                try
                {
                int i=1;
                File f=new File("Mad.txt");
                InputStream fin=new FileInputStream(f);
                int c=fin.read();
                while(c!=-1)
                {
                        System.out.println((char) c);
                        c=fin.read();
                }
                fin.close();
                }
                catch(Exception e)
                {
                        System.out.println("Reading interrupted");
                }
        }
}

public class threadDemo
{
        public static void main(String args[])
        {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                threadDemow w=new threadDemow(Thread.NORM_PRIORITY+1);
                threadDemor r=new threadDemor(Thread.NORM_PRIORITY-2);
                w.set("Harish","CSE",39);
                w.start();
                r.start();
                w.stop();
                r.stop();
                try
                {
                        w.t.join();
                        r.t.join();
                }
                catch(InterruptedException e)
                {
                        System.out.println("Interrupted Exception caught");
                }
        }
}
