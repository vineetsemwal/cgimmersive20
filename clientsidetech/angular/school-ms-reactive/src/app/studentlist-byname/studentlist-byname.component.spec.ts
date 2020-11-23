import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentlistBynameComponent } from './studentlist-byname.component';

describe('StudentlistBynameComponent', () => {
  let component: StudentlistBynameComponent;
  let fixture: ComponentFixture<StudentlistBynameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentlistBynameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentlistBynameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
