package com.xiaolianhust.designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
	
	protected LowerCaseInputStream(InputStream input) {
		super(input);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();//ί�б�װ�ζ�������Ӧ�õĶ�����
		return (c == -1 ? c : Character.toLowerCase(c));//����-1��ʾEOF�ļ�������
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for(int i = off;i < off + len;++i) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		try {
			InputStream lcs = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(".//TestFile//xx.txt")));
			try {
				int c;
				while((c = lcs.read()) != -1) {
					System.out.println((char)c);
				}
			} 
			finally {
				lcs.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}
}
