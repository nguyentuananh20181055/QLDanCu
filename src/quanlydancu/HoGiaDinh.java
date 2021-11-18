package quanlydancu;


	import java.util.Date;

	public class HoGiaDinh
	{
	    public static void main(String[] args)
	    {
	       Nguoi tv2[]=new Nguoi[4];
	       for(int i=0;i < 3;i++)
	       {
	        tv2[i]=new Nguoi();
	        tv2[i].nhapThongTin();
	        }
	        HoDan hd=new HoDan(3,3,tv2);
	        Date date=new Date();
	        System.out.println("Cac ho da nhap: ");
	        hd.inThongTin();
	        System.out.println("---***************---");
	        System.out.println("---***************---");
	    }
	    
	}