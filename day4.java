class Book{
    public List<String> title;
    public List<String> author;
    private List<Boolean> isAvailable;


    Book(List<String> title,List<String>Author,List<Boolean> isAvailable){
        this.title=new ArrayList<>(title);
        this.author=new ArrayList<>(author);
        this.isAvailable=new ArrayList<>(isAvailable);
    }
    public void borrowBook(String book){
        int index=title.indexOf(book);
        if(index==-1) return;
        if(isAvailable.get(index))isAvailable.set(index,false);
        else System.out.println("Book is not available");
    }
    public void returnBook(String book){
        int index=title.indexOf(book);
        isAvailable.set(index,true);
    }
    public void getAvailability(String book){
        int index=title.indexOf(book);
        if(isAvailable.get(index)==true)System.out.println("true");
        else System.out.println("False");
    }
}
