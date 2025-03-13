class GarbageCollectionDemo{
@Override
protected void finalize(){
	System.out.println("Object is being garbage collected");
}

	public static void main(String[]args){
		GarbageCollectionDemo g1 = new GarbageCollectionDemo();
		g1 = null;
		System.gc();
		
	}
}
		