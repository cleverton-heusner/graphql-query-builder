package fixtures;

public class GetPostQuery {

    private boolean postId;
    private boolean postTitle;
    private boolean postText;
    private boolean postDatePublished;
    private final Comments comments;
    private boolean postViews;
    private boolean postLikes;
    private final Popularity popularity;

    public GetPostQuery() {
        comments = new Comments(this);
        popularity = new Popularity(this);
    }

    public GetPostQuery selectPostId() {
        postId = true;
        return this;
    }

    public GetPostQuery selectPostTitle() {
        postTitle = true;
        return this;
    }

    public GetPostQuery selectPostText() {
        postText = true;
        return this;
    }

    public GetPostQuery selectPostDatePublished() {
        postDatePublished = true;
        return this;
    }

    public GetPostQuery selectPostViews() {
        postViews = true;
        return this;
    }

    public GetPostQuery selectPostLikes() {
        postLikes = true;
        return this;
    }

    public GetPostQuery skipPostId() {
        postId = false;
        return this;
    }

    public GetPostQuery skipPostTitle() {
        postTitle = false;
        return this;
    }

    public GetPostQuery skipPostText() {
        postText = false;
        return this;
    }

    public GetPostQuery skipPostDatePublished() {
        postDatePublished = false;
        return this;
    }

    public GetPostQuery skipPostViews() {
        postViews = false;
        return this;
    }

    public GetPostQuery skipPostLikes() {
        postLikes = false;
        return this;
    }

    public GetPostQuery selectAllFields() {
        postId = true;
        postTitle = true;
        postText = true;
        postDatePublished = true;
        postViews = true;
        postLikes = true;
        comments.selectAllFields();
        popularity.selectAllFields();
        return this;
    }

    public GetPostQuery ignoreAllFields() {
        postId = false;
        postTitle = false;
        postText = false;
        postDatePublished = false;
        postViews = false;
        postLikes = false;
        comments.ignoreAllFields();
        popularity.ignoreAllFields();
        return this;
    }

    public Comments fromComments() {
        return comments;
    }

    public Popularity fromPopularity() {
        return popularity;
    }

    public GetPostQuery endSelection() {
        return this;
    }
}