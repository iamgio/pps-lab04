package tasks.adts

import org.junit.*
import org.junit.Assert.*
import tasks.adts.SchoolModel.BasicSchoolModule.*
import u03.extensionmethods.Sequences.Sequence

class SchoolModelTest:
  @Test def empty(): Unit = {
    val school = emptySchool
    assertTrue(school.courses == Sequence.Nil())
    assertTrue(school.teachers == Sequence.Nil())
  }

  @Test def oneTeacherToCourse(): Unit = {
    val school = emptySchool.setTeacherToCourse(teacher("John"), course("Math"))
    assertTrue(school.hasTeacher("John"))
    assertTrue(school.hasCourse("Math"))
  }

