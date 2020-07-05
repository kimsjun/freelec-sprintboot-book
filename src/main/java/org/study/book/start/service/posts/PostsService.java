package org.study.book.start.service.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.book.start.domain.posts.PostsRepository;
import org.study.book.start.web.dto.PostsSaveRequestDto;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
