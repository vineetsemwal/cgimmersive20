package org.cap.apps.studentbootjparest.bookms.repository;

import org.cap.apps.studentbootjparest.bookms.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {
}
