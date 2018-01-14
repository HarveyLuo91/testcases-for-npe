package tests.resourceLeaks.ioStream;

import tests.resourceLeaks.supers.superTest1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOStreamtest18 {
	public void foo1() throws IOException{
		int x = 0;
		FileOutputStream fileOutputStream = new FileOutputStream(new File(""));
		superTest1 st = new t1class();
		st.set(fileOutputStream);
		st.close();
	}
	public void foo2() throws IOException{
		int x = 0;
		int a;
		FileOutputStream fileOutputStream = new FileOutputStream(new File(""));
		superTest1 st = new s1class();
		st.set(fileOutputStream);
		st.close();
	}
}
class t1class extends superTest1{
	@Override
	public void set(FileOutputStream f) {
		this.file = f;
	}
	@Override
	public void close() {
		try {
			this.file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class s1class extends superTest1 {
	@Override
	public void set(FileOutputStream f) {
		
		this.file = f;
	}
	@Override
	public void close() {
		int x = 0;
		System.out.println(x);
	}
}