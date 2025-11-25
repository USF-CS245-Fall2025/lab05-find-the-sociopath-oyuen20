import java.util.List;


public class Sociopath {

	public int findTheSociopath (int groupSize, List<int []> likeList) {
		if(groupSize <= 0){
			return -1;
		}
		int[] count = new int[groupSize + 1];
		boolean[] like = new boolean[groupSize + 1];
		for(int[] person : likeList){
			int liker = person[0];
			int liked = person[1];
			if(liker < 1 || liker > groupSize || liked < 1 || liked > groupSize){
				continue;

			}
			like[liker] = true;
			count[liked]++;
		}

		for(int person = 1; person <= groupSize; person++){
			if(!like[person] && count[person] == groupSize - 1){
				return person;
			}
		}

		return -1;
	}
}
