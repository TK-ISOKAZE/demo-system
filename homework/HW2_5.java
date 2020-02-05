/*
 *用对象数组制作一个点名器
 *需求:
 *手动输入要抽取的个数
 *不可以重复
 */

package homework;
import java.util.*;
public class HW2_5 {

	public static void main(String[] args) {
		String[] names={"刘鉴杰","朱小宏","周结辰","郑冠雄","刘浩","余嘉荣","高宁海",
				"幸希文","周星全","余靖","陈俊茂","邓衡顺","范洪林","林春吉","吕钟儒",
				"叶伟标","赖晓亮","谢梓键","颜俊伟","何业欢","吴华锋","王鑫萍","詹旭润",
				"陈昌","郑杰存","廖梓森","蔡炬言","郑梓芃","王伟杰","陈丽敏","杨泽宸",
				"苏君豪","张强","李金治","唐志军","吴骐宏","李志杰","杨鹏博","陈嘉杰",
				"彭国友","张镇源","黄乾","陈镇锋","何海强","陈延","武禹珩","杨华玲",
				"杨浩敞","黄睿","庄杰潮","陈志鹏","杨灼坤","陈洁锋","黄崇拥","罗宇峻",
				"刘晓生","梁钊晖","刘永胜","周锐","黎律民","王宇杰","卢金城","黄杰鸿",
				"丁小龙","梁劲斌","陈超","范洪林","何海强","邱垂淼","蔡炬言","占盛悠","苏炜燊"};
		Person[] per=new Person[names.length];
		for(int i=0;i<names.length;i++) {
			per[i]=new Person(names[i]);
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入要点多少人(输入0退出点名器)");
		int num;
		while(true){
			num=scan.nextInt();
			if(num==0)break;
			if(num<0||num>names.length) {
				System.out.println("请输入要点多少人1-72(输入0退出点名器)");
				continue;
			}
			int []result=new int[num];
			Random ran=new Random();
			tp:
			for(int i=0;i<num;i++) {
				int index=ran.nextInt(names.length);
				for(int j=0;j<i;j++) {
					if(index==result[j]) {
						i--;
						continue tp;
					}
					
				}
				result[i]=index;
			}
			for(int k=0;k<num;k++) {
				System.out.println(per[result[k]].getName()+" 年龄为"+per[result[k]].getAge());
				}
		}
		
		}

	}
