package NestedClass;

public class Outer {
	 private InnerB innerB = new InnerB();

	    public class InnerA{

	        public void callInner(){
	            InnerB innerB = new InnerB();
	        }
	    }

	    private class InnerB{

	    }

}
