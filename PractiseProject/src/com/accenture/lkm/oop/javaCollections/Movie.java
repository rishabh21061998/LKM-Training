package com.accenture.lkm.oop.javaCollections;

public class Movie  implements Comparable{
	
	private int movieId;
	private String movieName;
	private int rating;
	
	Movie(){
	}
	
	public Movie(int movieId, String movieName, int rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		return true;
	}
	
	public int getMovieId() {
		return movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public int getRating() {
		return rating;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		return result;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + "]";
	}

	//TODO: Implement the logic byName
	@Override
	public int compareTo(Object o) {
		return 0;
	}

	//MovieObj.compareTo(MovieObj1)
	//0 - both objects are same
	// -1 - lessthan
	// 1 - greater than
	/*
	 * @Override public int compareTo(Movie anotheMovieObj) { //terneray operator
	 * int lt; if(this.getMovieName()== anotheMovieObj.getMovieName()) { return 0; }
	 * else if(lt <0) { lt =
	 * this.getMovieName().compareTo(anotheMovieObj.getMovieName()); return -1; }
	 * return 1; }
	 */
}

