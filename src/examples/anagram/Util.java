package examples.anagram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

	public static boolean isAnagram( String left, String right ) {
		
		boolean valid = true;
		boolean nullOrEmpty = left == null || left.length() < 1 || right == null || right.length() < 1;
		
		if ( nullOrEmpty ) {
			
			valid = false;
			
		} else {
			
			List<String> leftList = new ArrayList<String>();
			List<String> rightList = new ArrayList<String>();
			
			for ( int i = 0; i < left.length(); i++ ) {
				
				String character = "" + left.charAt( i );
				leftList.add( character );
				
			}
			
			List<String> leftResult = leftList.stream().sorted().collect( Collectors.toList() );
			
			for ( int i = 0; i < right.length(); i++ ) {
				
				String character = "" + right.charAt( i );
				rightList.add( character );
				
			}
			
			List<String> rightResult = rightList.stream().sorted().collect( Collectors.toList() );
					
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
