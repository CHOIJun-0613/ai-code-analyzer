import React from 'react';
import { AlertCircle } from 'lucide-react';

interface FormErrorProps {
  message?: string;
}

export const FormError: React.FC<FormErrorProps> = ({ message }) => {
  if (!message) return null;

  return (
    <p className="text-sm text-red-600 mt-1 flex items-center gap-1">
      <AlertCircle className="w-3.5 h-3.5" />
      {message}
    </p>
  );
};

export default FormError;
