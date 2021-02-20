package examples.anagram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

	public static boolean isAnagram( String left, String right ) {
		
		boolean valid = false;
		boolean nullOrEmpty = left == null || left.length() < 1 || right == null || right.length() < 1;
		
		if ( nullOrEmpty ) {
			
			valid = false;
			
		}
		else if ( left.length() != right.length() ) {
			
			valid = false;
			
		} else {
			
			//convert strings to lists for stream manipulation
			
			List<String> leftList = new ArrayList<String>();
			List<String> rightList = new ArrayList<String>();
			
			for ( int i = 0; i < left.length(); i++ ) {
				
				String leftCharacter = "" + left.charAt( i );
				leftList.add( leftCharacter );
				
				String rightCharacter = "" + right.charAt( i );
				rightList.add( rightCharacter );
				
			}
			
			//sort
			
			List<String> leftResult = leftList.stream().sorted().collect( Collectors.toList() );
			List<String> rightResult = rightList.stream().sorted().collect( Collectors.toList() );
			
			//compare
			
			for ( int i = 0; i < leftResult.size(); i++ ) {
				
				String leftCharacter = leftResult.get( i );
				String rightCharacter = rightResult.get( i );
				valid = leftCharacter.equalsIgnoreCase( rightCharacter );
				
				if ( !valid ) {
					
					break;
					
				}			
				
			}
			
		} 
		
		return valid;
		
	}
	
}
