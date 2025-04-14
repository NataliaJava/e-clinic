INSERT INTO roles (name) VALUES
    ('ADMIN'),
    ('DOCTOR'),
    ('PATIENT')
ON CONFLICT (name) DO NOTHING;