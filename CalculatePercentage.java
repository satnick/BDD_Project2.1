package udf_proj;

//import org.apache.pig.EvalFunc;
import org.apache.pig.FilterFunc;
import java.io.IOException;

import org.apache.pig.data.Tuple;
//import org.apache.pig.data.TupleFactory;

public class CalculatePercentage extends EvalFunc<Tuple>{

	
	 public Boolean exec(Tuple Input) throws IOException{
		  if(Input==null||Input.size()==0)
		   return null;
		  try{
		  // String District;
		   int target,accomplished,result;
		   //District=(String)Input.get(0);
		   target=Integer.parseInt((String)Input.get(0));
		   accomplished=Integer.parseInt((String)Input.get(1));
		   result=100*(accomplished)/(target);
		      if (80!=result)
		       return false;
		     
		      return true;
		      //result=accomplished-target;
		           
		  }
		   catch(Exception e){
		   throw new IOException("Exception Processed",e);
		  }
		   
}
