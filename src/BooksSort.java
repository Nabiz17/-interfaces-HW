public interface BooksSort {
  default void BooksSort() {
    
    @Override
    public int compareTo (Book compareTo){

      if (/*this.*/get.author.compareTo(compareTo.get.author) < 0) {

        return -1;
      }
      if (/*this.*/get.author.compareTo(compareTo.get.author) > 0) {

        return 1;
      }

      if (/*this.*/get.bookTitle.compareTo(compareTo.get.bookTitle) < 0) {

        return -1;
      }
      if (/*this.*/get.bookTitle.compareTo(compareTo.get.bookTitle) > 0) {

        return 1;
      }

      return 0;
    }
  }
}

