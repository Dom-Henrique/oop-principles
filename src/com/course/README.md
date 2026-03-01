# 🚀 Project: Online Course Platform Management System

Develop a console-based backend application to manage an online course platform similar to Udemy and Coursera.

The system must allow full control of users, courses, enrolments, progress, and payments.

# 📌 Functional Requirements

## 1️⃣ User Management

The system must allow:

- User registration
- Different user types with distinct behaviours
- Data updates
- Account deactivation
- User listing

## Each user must have:

- Name
- Email (unique)
- Registration date
- Account status
- User type

## Some users may:

- Create courses
- Purchase courses
- Review courses
- Administer the system

---

## 2️⃣ Course Management

The system must allow:

- Course creation
- Publishing and unpublishing
- Information updates
- Listing by category
- Keyword search

## Each course must have:

- Title
- Description
- Price
- Responsible instructor
- Category
- Status (draft, published, archived)
- Reviews
- List of enrolled students

---

## 3️⃣ Enrolments

The system must allow:

- Users to enrol in published courses
- Enrolment cancellation
- Recording of enrolment date
- Student progress tracking (completion percentage)

**Rules:**

- A user cannot enrol twice in the same course
- Enrolment in unpublished courses is not allowed
- Deactivated users cannot enrol

---

## 4️⃣ Review System

After completing the course, the student may:

- Submit a rating (1 to 5)
- Write a comment
- Edit the review

**The system must:**

- Calculate the course average rating
- List reviews

---

## 5️⃣ Payments

Simulate a payment system:

- Different payment methods
- Transaction recording
- Transaction status
- Possibility of payment failure

**Rules:**

- Enrolment is confirmed only after payment approval
- Payment may be pending, approved, or declined

---

## 6️⃣ Reports

The system must generate:

- Total sales per course
- Total platform revenue
- Top 5 best-selling courses
- Average ratings per course
- Instructor ranking by revenue

---

# 📌 Technical Requirements (Advanced OOP)

The project MUST obligatorily use:

## ✔ Encapsulation

- No public attributes
- Proper use of getters/setters
- Internal validations

## ✔ Inheritance

- At least one type hierarchy with real specialisations

## ✔ Polymorphism

- Overridden methods
- Use of generic references for distinct behaviours

## ✔ Interfaces

Contracts for variable behaviours.

Example: payment, review, reporting.

## ✔ Enums

Enums must exist for:

- Account status
- Course status
- Payment status
- User type
- Course category

## ✔ Custom Exceptions

Create specific exceptions for:

- User already registered
- Course not published
- Payment declined
- Invalid review
- Duplicate enrolment

## ✔ Collections

Mandatory use of:

- List
- Set
- Map

Proper use of equals() and hashCode().

## ✔ Generics

Apply generics where appropriate.

## ✔ SOLID Principles

The project must follow:

- SRP (Single Responsibility Principle)
- OCP (Open/Closed Principle)
- LSP
- ISP
- DIP

## ✔ Mandatory Best Practices

- Immutable classes where appropriate
- Use of Optional where applicable
- Separation between domain and service layers
- Business rules layer separated
- Do not mix business logic with input handling

---

# 📌 Extra Requirements (Senior Level)

To raise the level:

- Implement Strategy pattern for payments
- Implement Factory pattern for object creation
- Implement a custom Comparator
- Implement operation logging
- Create an in-memory persistence system simulation
- Create unit tests (JUnit)

---

# 📌 Constraints

- Do not use frameworks (no Spring yet)
- Pure Java only
- No real database
- Console interface only

---

# 📈 Expected Skill Level After Completion

If completed correctly, you will be comfortable with:

- Real object-oriented modelling
- System architecture
- Clean code
- Design patterns
- Mid-level/Senior developer thinking