package tasks.adts

import org.junit.*
import org.junit.Assert.*
import tasks.adts.SchoolModel.*
import u03.extensionmethods.Sequences.Sequence

class SchoolModelTest:
  @Test def empty(): Unit = {
    val school = BasicSchoolModule.emptySchool
    assertTrue(school.courses == Sequence.Nil())
    assertTrue(school.teachers == Sequence.Nil())
  }

