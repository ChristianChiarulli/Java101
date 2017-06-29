class Primitives{
	public static void main(String[] args)
	{
		byte b;		// 8-bit signed
		short s;	// 16-bit signed
		int i;		// 32-bit signed
		long l;		// 64-bit signed
		float f;	// 32-bit 
		double d;	// 64-bit
		boolean bool;	// one bit
		char c;		// 16-bit unicode character

		b = 14;
		s = 20;
		i = 32;
		l = 178000;
		f = 23.456f; 	// remember float needs f at end
		d = 7823.323;
		bool = true;
		c = 'c'; 	// input number if you're curious about ascii representation 

		System.out.println("byte b      = " + b);
		System.out.println("short s     = " + s); 
		System.out.println("int i       = " + i); 
		System.out.println("long l      = " + l); 
		System.out.println("float f     = " + f); 
		System.out.println("double d    = " + d);
		System.out.println("boolean bool= " + bool); 
		System.out.println("char c      = " + c); 
	}
}
