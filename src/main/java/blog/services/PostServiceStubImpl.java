package blog.services;

import blog.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceStubImpl implements PostService {
    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public List<Post> findLatest5() {
        return null;
    }

    @Override
    public Post findById(Long id) {
        return null;
    }

    @Override
    public Post create(Post post) {
        return null;
    }

    @Override
    public Post edit(Post post) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
