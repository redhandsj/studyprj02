package jp.tuyano.spring.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String strs1[] = {"aaaa","bbbb"};
		String strs2[] = {"cccc","dddd"};
		
		strs1 = concatString(null,null);
		System.out.println(strs1.toString());

		return;
//		/*1つ目
//        *
//        */
//        List<String> lst = new ArrayList<String>();
//
//        lst.add("a");
//        lst.add("b");
//
//        StringBuilder builder = new StringBuilder();
////        System.out.println("1個目のlistの型" + lst.get(0).getClass());
//        for(String str : lst) {
//            builder.append("'").append(str).append("',");
//        }
//
//        String result = builder.substring(0, builder.length() - 1);
//        System.out.println("1個目のlistの中身。カンマ繋ぎ:" + result);
		
	}

	private static String[] concatString(final String[] array1 ,final String[] array2){
		int len = 0;
		if(array1 != null){
			len += array1.length;
		}
		if(array2 != null){
			len += array2.length;
		}
		if(len == 0){
			return null;
		}
		String[] arylist = new String[len];
		int i=0;
		if(array1 != null){
			for(String s : array1){
				arylist[i++] = s;
			}
		}
		if(array2 != null){
			for(String s : array2){
				arylist[i++] = s;
			}
		}
		return arylist;
	}

}
