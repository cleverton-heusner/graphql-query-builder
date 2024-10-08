package fixtures;

public class Author {

    private final Comments comments;
    private boolean authorId;
    private boolean authorName;
    private boolean authorEmail;
    private boolean authorProfilePicture;
    private boolean authorJoinedDate;
    private final Friends friends;

    public Author(final Comments comments) {
        this.comments = comments;
        friends = new Friends(this);
    }

    public Author selectAuthorId() {
        authorId = true;
        return this;
    }

    public Author selectAuthorName() {
        authorName = true;
        return this;
    }

    public Author selectAuthorEmail() {
        authorEmail = true;
        return this;
    }

    public Author selectAuthorProfilePicture() {
        authorProfilePicture = true;
        return this;
    }

    public Author selectAuthorJoinedDate() {
        authorJoinedDate = true;
        return this;
    }

    public Author skipAuthorId() {
        authorId = false;
        return this;
    }

    public Author skipAuthorName() {
        authorName = false;
        return this;
    }

    public Author skipAuthorEmail() {
        authorEmail = false;
        return this;
    }

    public Author skipAuthorProfilePicture() {
        authorProfilePicture = false;
        return this;
    }

    public Author skipAuthorJoinedDate() {
        authorJoinedDate = false;
        return this;
    }

    public Author selectAllFields() {
        authorId = true;
        authorName = true;
        authorEmail = true;
        authorProfilePicture = true;
        authorJoinedDate = true;
        friends.selectAllFields();
        return this;
    }

    public Author ignoreAllFields() {
        authorId = false;
        authorName = false;
        authorEmail = false;
        authorProfilePicture = false;
        authorJoinedDate = false;
        friends.ignoreAllFields();
        return this;
    }

    public Friends fromFriends() {
        return friends;
    }

    public Comments endAuthorSelection() {
        return comments;
    }
}