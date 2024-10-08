package fixtures;

public class Comments {

    private final GetPostQuery getPostQuery;
    private boolean commentsId;
    private boolean commentsText;
    private boolean commentsDatePublished;
    private final Author author;

    public Comments(final GetPostQuery getPostQuery) {
        this.getPostQuery = getPostQuery;
        author = new Author(this);
    }

    public Comments selectCommentsId() {
        commentsId = true;
        return this;
    }

    public Comments selectCommentsText() {
        commentsText = true;
        return this;
    }

    public Comments selectCommentsDatePublished() {
        commentsDatePublished = true;
        return this;
    }

    public Comments skipCommentsId() {
        commentsId = false;
        return this;
    }

    public Comments skipCommentsText() {
        commentsText = false;
        return this;
    }

    public Comments skipCommentsDatePublished() {
        commentsDatePublished = false;
        return this;
    }

    public Comments selectAllFields() {
        commentsId = true;
        commentsText = true;
        commentsDatePublished = true;
        author.selectAllFields();
        return this;
    }

    public Comments ignoreAllFields() {
        commentsId = false;
        commentsText = false;
        commentsDatePublished = false;
        author.ignoreAllFields();
        return this;
    }

    public Author fromAuthor() {
        return author;
    }

    public GetPostQuery endCommentsSelection() {
        return getPostQuery;
    }
}