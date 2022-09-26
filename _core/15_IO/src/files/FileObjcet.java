package files;

import java.io.File;

public class FileObjcet {

	public static void main(String[] args) {
		File f = new File("C:\\+java\\_lec\\_core\\15_IO\\outFileByLine.txt");

		String fileName = f.getName();
		System.out.println("경로를 제외한 파일 이름 :" +fileName);
		System.out.println("경로를 포함한 파일 이름 :" +f.getAbsolutePath());
		System.out.println("경로를 포함한 파일 이름 :" +f.getPath());
		System.out.println("파일이 속한 폴더 :" +f.getParent());
		System.out.println("-------------------------");
		System.out.println("파일 경로 구분자 : "+File.pathSeparator);
		System.out.println("파일 경로 구분문자 : "+File.pathSeparatorChar);
		System.out.println("파일 구분자 : "+File.separator);
		System.out.println("파일 구분 문자 : "+File.separatorChar);
		System.out.println("-------------------------");
		// f 에서 파일의 순수 이름과 확장를 구별해 보세요
		System.out.println("============================");
		System.out.println("사용자 폴더 "+ System.getProperty("user.dir"));
		System.out.println("자바시작경로 "+ System.getProperty("sun.boot.clas"));
		
		
		System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
		System.out.println(fileName.substring(0,fileName.indexOf(".")));
		System.out.println("============================");
		String[] strArr = fileName.split("\\.");
		
	}

}
