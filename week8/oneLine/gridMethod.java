class gridMethod {
	int y;
	int x;

	public int solve(){
		if (x < 0) {
			if (y < 1) {
				return 1;
			}
			else {
				return 2;
			}
		}
		else if(y < 1){
			return 3;
		}
		else {
			return 4;
		}
	}
}
