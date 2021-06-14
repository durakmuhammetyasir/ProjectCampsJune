using EntityLayer.Concrete;
using FluentValidation;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BusinessLayer.ValidationRulesFluentValidation
{
    public class CategoryValidator: AbstractValidator<Category>
    {
        public CategoryValidator()
        {
            RuleFor(x => x.CategoryName).NotEmpty().WithMessage("Kategori adini bos gecemezsiniz");
            RuleFor(x => x.CategoryDescription).NotEmpty().WithMessage("Aciklamayi bos gecemezsiniz");
            RuleFor(x => x.CategoryName).MinimumLength(3).WithMessage("Lutfen en az 3 karakter veriniz");
            RuleFor(x => x.CategoryName).MaximumLength(20).WithMessage("Category name 20 krakterden fazla olamaz");
        }
    }
}
