package in.sandipan.billingsoftware.service;

import org.springframework.web.multipart.MultipartFile;

import in.sandipan.billingsoftware.io.CategoryRequest;
import in.sandipan.billingsoftware.io.CategoryResponse;

import java.io.IOException;
import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request, MultipartFile file) throws IOException;

    List<CategoryResponse> read();

    void delete(String categoryId);
}
