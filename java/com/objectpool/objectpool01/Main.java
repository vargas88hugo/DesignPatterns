package com.objectpool.objectpool01;

import javafx.geometry.*;

public class Main {
	
	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(()->new Bitmap("Logo.bmp"), 1);
	
	public static void main(String[] args) {
		
		Bitmap b1 = bitmapPool.get();
		b1.setLocation(new Point2D(10, 10));

		b1.draw();
		
		Bitmap b2 = bitmapPool.get();
		b2.setLocation(new Point2D(-10, 0));
		
		b2.draw();
		
		bitmapPool.release(b2);
		bitmapPool.release(b1);
		
		
	}
}
