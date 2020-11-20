import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormCodedrivenComponent } from './form-codedriven.component';

describe('FormCodedrivenComponent', () => {
  let component: FormCodedrivenComponent;
  let fixture: ComponentFixture<FormCodedrivenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormCodedrivenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormCodedrivenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
