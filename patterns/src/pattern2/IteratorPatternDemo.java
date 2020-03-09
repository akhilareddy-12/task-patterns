package pattern2;


	interface Iterator {  
	    public boolean hasNext();  
	    public Object next();  
	}  
	 interface Basket {  
	    public Iterator getIterator();  
	}// End of the Iterator interface.  
	class CollectionofNames implements Basket {  
		public String name[]={"Anusha", "Sanju","Rishika","Ravi","Harsha"};   
		      
		@Override  
		    public Iterator getIterator() {  
		        return new CollectionofNamesIterate() ;  
		    }  
		    private class CollectionofNamesIterate implements Iterator{  
		        int i;  
		        @Override  
		        public boolean hasNext() {  
		            if (i<name.length){  
		                return true;  
		            }  
		            return false;  
		        }  
		        @Override  
		        public Object next() {  
		            if(this.hasNext()){  
		                return name[i++];  
		            }  
		            return null;      
		        }  
		    }  
		}  
	public class IteratorPatternDemo {  
	    public static void main(String[] args) {  
	          CollectionofNames cmpnyRepository = new CollectionofNames();  
	            
	          for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
	              String name = (String)iter.next();  
	              System.out.println("Name : " + name);  
	           }      
	    }  
	}  

