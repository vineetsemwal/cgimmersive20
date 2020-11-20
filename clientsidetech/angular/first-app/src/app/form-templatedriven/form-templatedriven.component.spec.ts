import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormTemplatedrivenComponent } from './form-templatedriven.component';

describe('FormTemplatedrivenComponent', () => {
  let component: FormTemplatedrivenComponent;
  let fixture: ComponentFixture<FormTemplatedrivenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormTemplatedrivenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormTemplatedrivenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
